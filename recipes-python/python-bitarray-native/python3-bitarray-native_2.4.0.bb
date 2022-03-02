SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
# Doesn't provide a LICENSE in the pypi package
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=76c1502273262a5ebefb50dfb20d7c4f"

PYPI_PACKAGE = "bitarray"

<<<<<<< HEAD:recipes-python/python-bitarray-native/python3-bitarray-native_2.3.7.bb
SRC_URI[md5sum] = "e45e87a1c03d8473b029d0475f5f14ad"
SRC_URI[sha256sum] = "4da790ab193e993107f3ff0aebc4f8d6ad5196a19071fbafad16b02898a44fd7"
=======
SRC_URI[md5sum] = "65bfac017965cc812fd2322e91fed441"
SRC_URI[sha256sum] = "f1203e902d51df31917d77eeba9c3fe78d032873a2ad78c737e26420f0080e58"
>>>>>>> cc861f6b7... Update python3-bitarray-native to 2.4.0:recipes-python/python-bitarray-native/python3-bitarray-native_2.4.0.bb

inherit pypi
inherit setuptools3
inherit native
