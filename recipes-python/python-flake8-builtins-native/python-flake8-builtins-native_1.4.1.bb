inherit setuptools
require python-flake8-builtins-native.inc

SRC_URI[md5sum] = "b7c7d3c26ac2a22e81407a689f78a44d"
SRC_URI[sha256sum] = "cd7b1b7fec4905386a3643b59f9ca8e305768da14a49a7efb31fe9364f33cd04"

## Set required python3 backports
DEPENDS += "${PYTHON_PN}-configparser-native ${PYTHON_PN}-enum34-native"