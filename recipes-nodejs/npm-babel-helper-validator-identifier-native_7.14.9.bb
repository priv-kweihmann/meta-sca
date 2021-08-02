SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.14.9.tgz"
SRC_URI[md5sum] = "b19e6b4736f42ac66b9c2e4716305c9f"
SRC_URI[sha256sum] = "4c59ebc81bb765278ff39baf216dbbf46e735304afa9cde840cbaa22bbb1a67e"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
