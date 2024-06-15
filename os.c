#include<stdio.h>

// Function to find the waiting time for all processes
void findWaitingTime(int processes[], int n, int burst_time[], int waiting_time[]) {
    int total_time = 0;
    waiting_time[0] = 0; // Waiting time for first process is 0

    // Calculate waiting time
    for (int i = 1; i < n; i++) {
        // Add burst time of previous processes
        total_time += burst_time[i - 1];
        // Waiting time is total_time - arrival_time
        waiting_time[i] = total_time - processes[i];
        // If waiting time is negative, make it 0
        if (waiting_time[i] < 0)
            waiting_time[i] = 0;
    }
}

// Function to calculate turn around time
void findTurnAroundTime(int processes[], int n, int burst_time[], int waiting_time[], int turn_around_time[]) {
    // Turn around time is burst time + waiting time
    for (int i = 0; i < n; i++)
        turn_around_time[i] = burst_time[i] + waiting_time[i];
}

// Function to calculate average waiting and turn around time
void findAvgTime(int processes[], int n, int burst_time[]) {
    int waiting_time[n], turn_around_time[n];

    // Find waiting time for all processes
    findWaitingTime(processes, n, burst_time, waiting_time);

    // Find turn around time for all processes
    findTurnAroundTime(processes, n, burst_time, waiting_time, turn_around_time);

    // Display results
    printf("Process\tBurst Time\tWaiting Time\tTurnaround Time\n");
    int total_waiting_time = 0, total_turn_around_time = 0;
    for (int i = 0; i < n; i++) {
        total_waiting_time += waiting_time[i];
        total_turn_around_time += turn_around_time[i];
        printf("%d\t\t%d\t\t%d\t\t%d\n", i + 1, burst_time[i], waiting_time[i], turn_around_time[i]);
    }
    printf("Average waiting time: %.2f\n", (float)total_waiting_time / n);
    printf("Average turnaround time: %.2f\n", (float)total_turn_around_time / n);
}

// Driver code
int main() {
    int processes[] = {1, 2, 3};
    int n = sizeof(processes) / sizeof(processes[0]);
    int burst_time[] = {6, 8, 7};
    findAvgTime(processes, n, burst_time);
 return 0;
}