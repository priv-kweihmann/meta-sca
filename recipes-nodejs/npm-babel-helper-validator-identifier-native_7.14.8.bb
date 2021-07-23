SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.14.8.tgz"
SRC_URI[md5sum] = "271529f882e576b34385cf1b25268e95"
SRC_URI[sha256sum] = "3570c590a36d59e16704a0d1d7d93d5e9cc5f9301ea272eb1336618979c9ecad"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
