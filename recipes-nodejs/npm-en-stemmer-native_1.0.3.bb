SUMMARY = "NPM: en-stemmer"
DESCRIPTION = "porter stemmer implmentation"
HOMEPAGE = "https://github.com/finnlp/en-stemmer#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7c5dbe3099281e1c0d0416911c6371ed"

SRC_URI = "https://registry.npmjs.org/en-stemmer/-/en-stemmer-1.0.3.tgz"
SRC_URI[md5sum] = "d6e7d98388f7040c9ae0e9d1bf394e4c"
SRC_URI[sha256sum] = "730b913c30e2de6ce3a57996989c0af06b4ddc5121ff33d05ba3d687c64e3da2"

NPM_PKGNAME = "en-stemmer"

inherit npmhelper
inherit native
