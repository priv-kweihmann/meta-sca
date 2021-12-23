SUMMARY = "NPM: colorette"
DESCRIPTION = "🌈Easily set your terminal text color & styles."
HOMEPAGE = "https://github.com/jorgebucaran/colorette#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e45dd216c3fe7c3ca8f67f20bcd5dadc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colorette/-/colorette-2.0.16.tgz"
SRC_URI[md5sum] = "dba544c1e1031b01573251b7d77f0820"
SRC_URI[sha256sum] = "84c412534f9fbbd7f3647ebc89077fa4f606d86ba00a108e32d9c1166357a3d8"

NPM_PKGNAME = "colorette"

inherit npmhelper
inherit native
