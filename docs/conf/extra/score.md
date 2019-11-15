# Configuration for score

This module does try to calculate a score (like pylint does) for all findings.
It divides the score into 3 sections

* security - covering all the issues that might be security relevant
* functional - functional defects
* style - only stylistic issues

You can configure a threshold value to issue a warning or an error when the calculated score is below.
This should help you identifying modules that are of bad quality.

Do not expect any other output of this module than a warning or an error in build console (if you have the bitbake module enabled also there).

The default settings are taken from the individual tool setting files.

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_score | Blacklist filter for this tool | space-separated-list | ""
| SCA_SCORE_ERROR_PEN | Score penalty multiplier for an error | float | "7"
| SCA_SCORE_EXTRA_FUNCTIONAL | Extra finding IDs to put into functional classification | space-separated-list | ""
| SCA_SCORE_EXTRA_SECURITY | Extra finding IDs to put into security classification | space-separated-list | ""
| SCA_SCORE_EXTRA_STYLE | Extra finding IDs to put into style classification | space-separated-list | ""
| SCA_SCORE_FUNCTIONAL_ERROR | Threshold when to issue an error at functional score | float | "35"
| SCA_SCORE_FUNCTIONAL_PEN | Score penalty for a functional issue | float | "5"
| SCA_SCORE_FUNCTIONAL_WARN | Threshold when to issue a warning at functional score | float | "60"
| SCA_SCORE_INFO_PEN | Score penalty multiplier for an info | float | "1"
| SCA_SCORE_SECURITY_ERROR | Threshold when to issue an error at security score | float | "48"
| SCA_SCORE_SECURITY_PEN | Score penalty for a security issue | float | "100"
| SCA_SCORE_SECURITY_WARN | Threshold when to issue a warning at security score | float | "70"
| SCA_SCORE_SECURITY_WARN | Threshold when to issue a warning at security score | float | "70"
| SCA_SCORE_STYLE_ERROR | Threshold when to issue an error at style score | float | "15"
| SCA_SCORE_STYLE_PEN | Score penalty for a style issue | float | "1"
| SCA_SCORE_STYLE_WARN | Threshold when to issue a warning at style score | float | "40"
| SCA_SCORE_WARNING_PEN | Score penalty multiplier for a warning | float | "5"

## Supports

* [ ] suppression of ids
* [ ] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] required online access

## Known error-ids

**None**
