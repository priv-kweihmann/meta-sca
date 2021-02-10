SUMMARY = "Create Python CLI apps with little to no effort at all!"
HOMEPAGE = "https://github.com/rubik/mando"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3c8e41bdf640795815537c1ce89a3aa"

PYPI_PACKAGE = "mando"

SRC_URI[md5sum] = "134f305362d09c9d5f4acffc6967033a"
SRC_URI[sha256sum] = "5306a91109096fe2e204a1f5ae141038842193f7210a7930c8ee73ccb7ecbf62"

inherit pypi
inherit setuptools3
inherit native
