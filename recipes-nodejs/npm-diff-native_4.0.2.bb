SUMMARY = "NPM: diff"
DESCRIPTION = "A javascript text diff implementation."
HOMEPAGE = "https://github.com/kpdecker/jsdiff#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6f0309f3f9919cd96cc45a4d4859c54"

SRC_URI = "https://registry.npmjs.org/diff/-/diff-4.0.2.tgz"
SRC_URI[md5sum] = "4a82e77b31b0d8db9d56c54d3726a85c"
SRC_URI[sha256sum] = "7c3da249f70d3a42e2ea234019cb3508758c1328c06afcff98caaec3a81be33d"

NPM_PKGNAME = "diff"

inherit npmhelper
inherit native
