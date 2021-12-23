SUMMARY = "NPM: passive-voice"
DESCRIPTION = "detect passive voice"


DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=63;md5=477dfa54ede28e2f361e7db05941d7a7"

SRC_URI = "https://registry.npmjs.org/passive-voice/-/passive-voice-0.1.0.tgz"
SRC_URI[md5sum] = "416266b908515c2c3cb9fcefdca3978e"
SRC_URI[sha256sum] = "dd4cb61d1ac7a44308214e2e6b78f608217ccefb6984f80a3d0e09da4130ee95"

NPM_PKGNAME = "passive-voice"

inherit npmhelper
inherit native
