SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.10.1.tgz"
SRC_URI[md5sum] = "509ca3c451bd9ed4a739230ac9a95213"
SRC_URI[sha256sum] = "b4b18b29823e22a27e6c26bb69a33ce21c6b4ca5238bb05ec13d747183d8ef12"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
