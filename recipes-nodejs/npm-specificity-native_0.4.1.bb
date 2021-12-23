SUMMARY = "NPM: specificity"
DESCRIPTION = "Calculate the specificity of a CSS selector"
HOMEPAGE = "https://github.com/keeganstreet/specificity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5bf029afd53c04c00055892f494d35c2"

SRC_URI = "https://registry.npmjs.org/specificity/-/specificity-0.4.1.tgz"
SRC_URI[md5sum] = "7b42856571b35f60dfba8cd41a06f8b3"
SRC_URI[sha256sum] = "42d72ec6c0d89b6d201b8e854d0fff2e4cdb1b7da87e89144deb78379e6ea2c4"

NPM_PKGNAME = "specificity"

inherit npmhelper
inherit native
