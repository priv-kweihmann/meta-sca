inherit setuptools
require python-ruamelyaml-native.inc

SRC_URI[md5sum] = "bb11330d15e04fc3ec42e94f8910be82"
SRC_URI[sha256sum] = "0939bcb399ad037ef903d74ccf2f8a074f06683bc89133ad19305067d34487c8"

DEPENDS += "${PYTHON_PN}-ruamelordereddict-native"
