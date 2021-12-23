SUMMARY = "NPM: html-tags"
DESCRIPTION = "List of standard HTML tags"
HOMEPAGE = "https://github.com/sindresorhus/html-tags#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/html-tags/-/html-tags-3.1.0.tgz"
SRC_URI[md5sum] = "9514cf2232ab55762b0942c1216373a3"
SRC_URI[sha256sum] = "eba22db8562a1df7e3f9aacb42957b84f3c4d00809739a415959ff6787bb0649"

NPM_PKGNAME = "html-tags"

inherit npmhelper
inherit native
