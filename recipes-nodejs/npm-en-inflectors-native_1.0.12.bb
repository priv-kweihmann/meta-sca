SUMMARY = "NPM: en-inflectors"
DESCRIPTION = "English Inflectors Library For noun (plural to singular and singular to plural), verb (gerund, present & past) and adjective (comparative, superlative) transformations"
HOMEPAGE = "https://github.com/finnlp/en-inflectors#readme"

DEPENDS = "npm-en-stemmer-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7c5dbe3099281e1c0d0416911c6371ed"

SRC_URI = "https://registry.npmjs.org/en-inflectors/-/en-inflectors-1.0.12.tgz"
SRC_URI[md5sum] = "164c3fd6271128925ca72badcce94724"
SRC_URI[sha256sum] = "f53c3802f90148684ab37e7ff1668df01869c11a4ca943d60e79cae77fafbeac"

NPM_PKGNAME = "en-inflectors"

inherit npmhelper
inherit native
