SUMMARY = "NPM: humannames"
DESCRIPTION = "A list, huge one (~200K) of human male/female first/last names."
HOMEPAGE = "https://github.com/finnlp/humannames#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7c5dbe3099281e1c0d0416911c6371ed"

SRC_URI = "https://registry.npmjs.org/humannames/-/humannames-1.0.5.tgz"
SRC_URI[md5sum] = "66c8a26e99478420b41d0528239f9488"
SRC_URI[sha256sum] = "2fe1b08a4805e5f643f4b007f49c833f74d14c78a1b1860445783eb1f432c628"

NPM_PKGNAME = "humannames"

inherit npmhelper
inherit native
