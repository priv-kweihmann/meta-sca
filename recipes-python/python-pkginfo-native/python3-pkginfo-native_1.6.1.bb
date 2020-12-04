SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://bazaar.launchpad.net/~tseaver/pkginfo/trunk/files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

PYPI_PACKAGE = "pkginfo"

SRC_URI[md5sum] = "c38eaaee71bef6df7cec228a1dd1a645"
SRC_URI[sha256sum] = "a6a4ac943b496745cec21f14f021bbd869d5e9b4f6ec06918cffea5a2f4b9193"

inherit pypi
inherit native
inherit setuptools3
