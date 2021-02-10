SUMMARY = "Discover and load entry points from installed packages"
HOMEPAGE = "https://github.com/takluyver/entrypoints"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6f7f5bd22a5dc0397c806c4e5f8cbd3"

PYPI_PACKAGE = "entrypoints"

SRC_URI[md5sum] = "c5c61ea2e46a0c50ea08f4af7955a0b1"
SRC_URI[sha256sum] = "c70dd71abe5a8c85e55e12c19bd91ccfeec11a6e99044204511f9ed547d48451"

inherit pypi
inherit setuptools3
inherit native
