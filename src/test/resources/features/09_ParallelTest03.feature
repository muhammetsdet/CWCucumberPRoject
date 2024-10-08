@Parallel
Feature: Parallel Test Feature

  @ParallelGoogle
  Scenario: Google Test
    Given user goes to Google
    When user verifies title contains "Google"
    Then user closers driver

