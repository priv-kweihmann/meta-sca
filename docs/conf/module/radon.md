### Available configuration for radon

Within this module you can define metrics on any python source code.
This module offers the possibility to issue a warning or an error if a configured threshold is exceeded.

## Supported environments/languages

* python
* metrics

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_radon | Blacklist filter for this tool | space-separated-list | ""
| SCA_RADON_ERROR_cyclomatic_max_gt | Threshold for maximum cyclomatic complexity before issuing an error | float-string | "30.0"
| SCA_RADON_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_RADON_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_RADON_WARN_cyclomatic_max_gt | Threshold for maximum cyclomatic complexity before issuing a warning | float-string | "15.0"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Detailed configuration

To configure a threshold define a variable

**SCA_RADON_WARN_\<ID\>_gt** - for a warning when the value if greater than the threshold
**SCA_RADON_WARN_\<ID\>_lt** - for a warning when the value if less than the threshold
**SCA_RADON_ERROR_\<ID\>_gt** - for a warning when the value if greater than the threshold
**SCA_RADON_ERROR_\<ID\>_lt** - for a warning when the value if less than the threshold

All values are floating point units (as string).

## Known error-ids

 * blank_lines_max - Lines with no content max
 * blank_lines_mean - Lines with no content mean
 * blank_lines_median - Lines with no content median
 * blank_lines_min - Lines with no content min
 * blank_lines_sd - Lines with no content standard deviation
 * blank_lines_sum - Lines with no content overall sum
 * cc_max - Cyclomatic complexity max
 * cc_mean - Cyclomatic complexity mean
 * cc_median - Cyclomatic complexity median
 * cc_min - Cyclomatic complexity min
 * cc_sd - Cyclomatic complexity standard deviation
 * cc_sum - Cyclomatic complexity overall sum
 * comments_max - comments max
 * comments_mean - comments mean
 * comments_median - comments median
 * comments_min - comments min
 * comments_sd - comments standard deviation
 * comments_sum - comments overall sum
 * halstaed_bugs_max - Halstaed bug probability max
 * halstaed_bugs_mean - Halstaed bug probability mean
 * halstaed_bugs_median - Halstaed bug probability median
 * halstaed_bugs_min - Halstaed bug probability min
 * halstaed_bugs_sd - Halstaed bug probability standard deviation
 * halstaed_bugs_sum - Halstaed bug probability overall sum
 * halstaed_calc_length_max - Halstaed calculated length max
 * halstaed_calc_length_mean - Halstaed calculated length mean
 * halstaed_calc_length_median - Halstaed calculated length median
 * halstaed_calc_length_min - Halstaed calculated length min
 * halstaed_calc_length_sd - Halstaed calculated length standard deviation
 * halstaed_calc_length_sum - Halstaed calculated length overall sum
 * halstaed_difficulty_max - Halstaed difficulty max
 * halstaed_difficulty_mean - Halstaed difficulty mean
 * halstaed_difficulty_median - Halstaed difficulty median
 * halstaed_difficulty_min - Halstaed difficulty min
 * halstaed_difficulty_sd - Halstaed difficulty standard deviation
 * halstaed_difficulty_sum - Halstaed difficulty overall sum
 * halstaed_dist_operands_max - Halstaed number of distinct operands max
 * halstaed_dist_operands_mean - Halstaed number of distinct operands mean
 * halstaed_dist_operands_median - Halstaed number of distinct operands median
 * halstaed_dist_operands_min - Halstaed number of distinct operands min
 * halstaed_dist_operands_sd - Halstaed number of distinct operands standard deviation
 * halstaed_dist_operands_sum - Halstaed number of distinct operands overall sum
 * halstaed_dist_operators_max - Halstaed number of distinct operators max
 * halstaed_dist_operators_mean - Halstaed number of distinct operators mean
 * halstaed_dist_operators_median - Halstaed number of distinct operators median
 * halstaed_dist_operators_min - Halstaed number of distinct operators min
 * halstaed_dist_operators_sd - Halstaed number of distinct operators standard deviation
 * halstaed_dist_operators_sum - Halstaed number of distinct operators overall sum
 * halstaed_effort_max - Halstaed effort max
 * halstaed_effort_mean - Halstaed effort mean
 * halstaed_effort_median - Halstaed effort median
 * halstaed_effort_min - Halstaed effort min
 * halstaed_effort_sd - Halstaed effort standard deviation
 * halstaed_effort_sum - Halstaed effort overall sum
 * halstaed_length_max - Halstaed length max
 * halstaed_length_mean - Halstaed length mean
 * halstaed_length_median - Halstaed length median
 * halstaed_length_min - Halstaed length min
 * halstaed_length_sd - Halstaed length standard deviation
 * halstaed_length_sum - Halstaed length overall sum
 * halstaed_time_max - Halstaed time max
 * halstaed_time_mean - Halstaed time mean
 * halstaed_time_median - Halstaed time median
 * halstaed_time_min - Halstaed time min
 * halstaed_time_sd - Halstaed time standard deviation
 * halstaed_time_sum - Halstaed time overall sum
 * halstaed_total_operands_max - Halstaed total number of operands max
 * halstaed_total_operands_mean - Halstaed total number of operands mean
 * halstaed_total_operands_median - Halstaed total number of operands median
 * halstaed_total_operands_min - Halstaed total number of operands min
 * halstaed_total_operands_sd - Halstaed total number of operands standard deviation
 * halstaed_total_operands_sum - Halstaed total number of operands overall sum
 * halstaed_total_operators_max - Halstaed total number of operators max
 * halstaed_total_operators_mean - Halstaed total number of operators mean
 * halstaed_total_operators_median - Halstaed total number of operators median
 * halstaed_total_operators_min - Halstaed total number of operators min
 * halstaed_total_operators_sd - Halstaed total number of operators standard deviation
 * halstaed_total_operators_sum - Halstaed total number of operators sum
 * halstaed_vocabulary_max - Halstaed vocabulary max
 * halstaed_vocabulary_mean - Halstaed vocabulary mean
 * halstaed_vocabulary_median - Halstaed vocabulary median
 * halstaed_vocabulary_min - Halstaed vocabulary min
 * halstaed_vocabulary_sd - Halstaed vocabulary standard deviation
 * halstaed_vocabulary_sum - Halstaed vocabulary overall sum
 * halstaed_volume_max - Halstaed volume max
 * halstaed_volume_mean - Halstaed volume mean
 * halstaed_volume_median - Halstaed volume median
 * halstaed_volume_min - Halstaed volume min
 * halstaed_volume_sd - Halstaed volume standard deviation 
 * halstaed_volume_sum - Halstaed volume overall sum
 * lloc_max - Logical Lines of Code max
 * lloc_mean - Logical Lines of Code mean
 * lloc_median - Logical Lines of Code median
 * lloc_min - Logical Lines of Code min
 * lloc_sd - Logical Lines of Code standard deviation
 * lloc_sum - Logical Lines of Code overall sum
 * loc_max - Lines of Code max
 * loc_mean - Lines of Code mean
 * loc_median - Lines of Code median
 * loc_min - Lines of Code min
 * loc_sd - Lines of Code standard deviation
 * loc_sum - Lines of Code overall sum
 * maint_index_max - Maintenance index max
 * maint_index_mean - Maintenance index mean
 * maint_index_median - Maintenance index median
 * maint_index_min - Maintenance index min
 * maint_index_sd - Maintenance index standard deviation
 * maint_index_sum - Maintenance index overall sum
 * multiline_strings_max - Multi-line strings max
 * multiline_strings_mean - Multi-line strings mean
 * multiline_strings_median - Multi-line strings median
 * multiline_strings_min - Multi-line strings min
 * multiline_strings_sd - Multi-line strings standard deviation
 * multiline_strings_sum - Multi-line strings overall sum
 * singleline_comments_max - Single-line comments max
 * singleline_comments_mean - Single-line comments mean
 * singleline_comments_median - Single-line comments median
 * singleline_comments_min - Single-line comments min
 * singleline_comments_sd - Single-line comments standard deviation
 * singleline_comments_sum - Single-line comments overall sum

## Checking scope

- [ ] security
- [ ] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* radon.radon.*
