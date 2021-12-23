SUMMARY = "NPM: diff"
DESCRIPTION = "A javascript text diff implementation."
HOMEPAGE = "https://github.com/kpdecker/jsdiff#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6f0309f3f9919cd96cc45a4d4859c54"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/diff/-/diff-5.0.0.tgz"
SRC_URI[md5sum] = "a6db67e2eeb11fd4cf5135da638e2157"
SRC_URI[sha256sum] = "f8911521b249c1171e3be1e728e6490e761c032f89d5c9f2e418dc0bdaba8b33"

NPM_PKGNAME = "diff"

inherit npmhelper
inherit native
