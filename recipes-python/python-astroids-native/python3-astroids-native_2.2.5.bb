inherit setuptools3
require python-astroids-native.inc

SRC_URI[md5sum] = "0e686c4f817ddcd3be18b31df644c3bc"
SRC_URI[sha256sum] = "6560e1e1749f68c64a4b5dee4e091fce798d2f0d84ebe638cf0e0585a343acf4"

DEPENDS += "${PYTHON_PN}-typed-ast-native"
