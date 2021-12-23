SUMMARY = "NPM: boundary"
DESCRIPTION = "Provides boundary functions, (upper-bound and lower-bound)."
HOMEPAGE = "https://github.com/Constellation/boundary"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=52;md5=9c6942b190be713b724358bcd4f8a08c"

SRC_URI = "https://registry.npmjs.org/boundary/-/boundary-1.0.1.tgz"
SRC_URI[md5sum] = "92ca968d7d7eda0bc57a2289f3776152"
SRC_URI[sha256sum] = "ac56e7132d5b17d786f326f18567a97dafc3dc829f6aa24fe3de8fb3ddda6873"

NPM_PKGNAME = "boundary"

inherit npmhelper
inherit native
