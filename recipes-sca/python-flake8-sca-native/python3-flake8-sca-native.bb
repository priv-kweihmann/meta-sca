inherit python3-dir
require python-flake8-sca-native.inc

## With python3 we can also use the following
DEPENDS += "\
            ${PYTHON_PN}-flake8-executable-native \
            ${PYTHON_PN}-wemake-python-styleguide-native \
           "

## If we have python 3.6+ additionally enable the following
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-2020-native', '')}"
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-fixme-native', '')}"
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-strict-native', '')}"
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-variables-names-native', '')}"