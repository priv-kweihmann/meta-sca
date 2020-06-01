SUMMARY = "NPM: interpret"
DESCRIPTION = "A dictionary of file extensions and associated module loaders."
HOMEPAGE = "https://github.com/gulpjs/interpret#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48fa72a2fa812dd4ebc86cf02c4b3b77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/interpret/-/interpret-2.1.0.tgz"
SRC_URI[md5sum] = "4d481b4d30e2b2f385fb78e163659f50"
SRC_URI[sha256sum] = "c0d045f6f20c83a64d9da5674b95d0e1a78ca07dffb39ae8ec62cd496a0e6a9c"

NPM_PKGNAME = "interpret"

inherit npmhelper
inherit native
