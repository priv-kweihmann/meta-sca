inherit python3-dir
require python-flake8-sca-native.inc

## With python3 we can also use the following
DEPENDS += "\
            ${PYTHON_PN}-flake8-executable-native \
            ${PYTHON_PN}-flake8-fixme-native \
            ${PYTHON_PN}-flake8-strict-native \
           "