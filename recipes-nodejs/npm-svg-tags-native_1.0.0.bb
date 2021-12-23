SUMMARY = "NPM: svg-tags"
DESCRIPTION = "List of standard SVG tags."
HOMEPAGE = "https://github.com/element-io/svg-tags"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cea94a994f97253585d633ff6c32bdcb"

SRC_URI = "https://registry.npmjs.org/svg-tags/-/svg-tags-1.0.0.tgz"
SRC_URI[md5sum] = "43760ca7ae7e73d8ca7279b69b8423bd"
SRC_URI[sha256sum] = "910d8e7b8ea8e1b944c7cf6410934d4461e0ed87bbdf075fa331ea6e266fbe2e"

NPM_PKGNAME = "svg-tags"

inherit npmhelper
inherit native
