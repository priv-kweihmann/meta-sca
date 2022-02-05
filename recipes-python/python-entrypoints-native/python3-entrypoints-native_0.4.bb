SUMMARY = "Discover and load entry points from installed packages"
HOMEPAGE = "https://github.com/takluyver/entrypoints"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6f7f5bd22a5dc0397c806c4e5f8cbd3"

PYPI_PACKAGE = "entrypoints"

SRC_URI[md5sum] = "3acd8b72119a8fb1eac7030c24ac6b49"
SRC_URI[sha256sum] = "b706eddaa9218a19ebcd67b56818f05bb27589b1ca9e8d797b74affad4ccacd4"

inherit pypi
inherit setuptools3
inherit sca-setuptools-legacy
inherit native
