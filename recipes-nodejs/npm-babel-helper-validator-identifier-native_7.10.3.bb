SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.10.3.tgz"
SRC_URI[md5sum] = "1e7fb9ea5b599bf255389d5304aaa6f9"
SRC_URI[sha256sum] = "8d29b2260ebfbdf665a781f56e2c18f6d45b20837aa479ec71692537f37359c3"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
