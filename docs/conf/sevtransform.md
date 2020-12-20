# Configure custom severity

Sometimes you may want to change the severity of a finding in the context of a project or even in a single recipe.
This may help you to pick a single (or multiple) ID(s), which otherwise would be filtered out due to too low severity.
Also this can be used to "downgrade" findings with originally high severity to a lower level, because they don't matter in your particular context.

## Configuration

For this purpose the following variables exist

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:|
| SCA_SEVERITY_TRANSFORM | List of rules (see below) | space separated regular expression | ""
| SCA_SEVERITY_TRANSFORM_EXTRA | List of rules (see below) | space separated regular expression | ""

## Rule

A rule consists of a regular expression and a severity you want to set, separated by "=".

### Rule example

If you want to set the severity of a finding with the ID "pylint.pylint.C103" to "error" you can add the following to either __SCA_SEVERITY_TRANSFORM__ or __SCA_SEVERITY_TRANSFORM_EXTRA__

```sh
pylint.pylint.C103=error
```

you can even set all pylint-findings to error with

```sh
pylint.*=error
```

Rules should be combined to a space-separated list when being assigned to the variables mentioned above.

## Notes

For global configuration please use __SCA_SEVERITY_TRANSFORM__.

To append in the scope of a recipe please use __SCA_SEVERITY_TRANSFORM_EXTRA__.

Both lists are merged before being used internally.
