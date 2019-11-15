# BestOf mode

BestOf mode is an advanced filter for findings. In this mode only the findings are listed where more than one tool has reported a finding in source code.

You can call it the lazy programmers mode.
Main purpose of this module is to filter out the findings, which have been reported by one tool only. So the result of BestOf mode should give you a very strong hint that the finding reported is real.

You can either filter by a minimum number of tools that should have reported a finding (threshold), or by a percentage of tools that reported a finding (ratio).

The filtering is done on the basis of checked language (e.g. C, shell, python, a.s.o).
If there is only 1 tool available for the language the results will remain untouched/unfiltered.

This mode might be helpful for people who are drowning in false positives or are simply overwhelmed by the amount of findings.

__NOTE: the chance that this mode does also filter out important messages is extremely high. So use it with caution__

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BESTOF_MODE | Filter mode | threshold or ratio | "threshold"
| SCA_BESTOF_RATIO | Percentage of tools that reported a finding  | float 0.0-1.0 | "0.5"
| SCA_BESTOF_THRESHOLD_MIN | Minimum value of tools that reported a finding | number | "2"
