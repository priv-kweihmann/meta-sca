inherit setuptools
require python-importlib-metadata-native.inc

SRC_URI[md5sum] = "7e097faecf425c79bafef3ec271d57e5"
SRC_URI[sha256sum] = "cb6ee23b46173539939964df59d3d72c3e0c1b5d54b84f1d8a7e912fe43612db"

DEPENDS += "${PYTHON_PN}-pathlib2-native ${PYTHON_PN}-contextlib2-native ${PYTHON_PN}-configparser-native"
