SUMMARY = "NPM: interpret"
DESCRIPTION = "A dictionary of file extensions and associated module loaders."
HOMEPAGE = "https://github.com/gulpjs/interpret#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48fa72a2fa812dd4ebc86cf02c4b3b77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/interpret/-/interpret-2.0.0.tgz"
SRC_URI[md5sum] = "365433d2c9242584733203f64912528a"
SRC_URI[sha256sum] = "fd74f3d7beb766d894f396ca37806b7568413e16ff4d385ce5577f02a3e57501"

NPM_PKGNAME = "interpret"

inherit npmhelper
inherit native
