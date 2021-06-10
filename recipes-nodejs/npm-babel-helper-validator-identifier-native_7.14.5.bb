SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.14.5.tgz"
SRC_URI[md5sum] = "cc57653b740fcbc415f4b394b2da0cf9"
SRC_URI[sha256sum] = "e3cfa6da99b6e7a40b48bd3499eafbdb4e831db9de92b7fb9b6e2eba949169c2"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
