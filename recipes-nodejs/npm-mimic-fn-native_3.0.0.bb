SUMMARY = "NPM: mimic-fn"
DESCRIPTION = "Make a function mimic another one"
HOMEPAGE = "https://github.com/sindresorhus/mimic-fn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mimic-fn/-/mimic-fn-3.0.0.tgz"
SRC_URI[md5sum] = "a0b11882bb991342ef674ccb7ab4a589"
SRC_URI[sha256sum] = "b8a1318e21556acb8aa3a6bc4e6d0e25a9024cfd82c20f78b61f1326103c7525"

NPM_PKGNAME = "mimic-fn"

inherit npmhelper
inherit native
