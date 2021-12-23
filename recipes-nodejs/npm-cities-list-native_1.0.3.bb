SUMMARY = "NPM: cities-list"
DESCRIPTION = "A list, huge one, (~80K) of cities."
HOMEPAGE = "https://github.com/finnlp/cities-list.git#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7c5dbe3099281e1c0d0416911c6371ed"

SRC_URI = "https://registry.npmjs.org/cities-list/-/cities-list-1.0.3.tgz"
SRC_URI[md5sum] = "78fe3e18f09604a61beb6327d05c2388"
SRC_URI[sha256sum] = "96d0aeabbe3063c310952f138404ef21ab15597d33cd25f202bccd122906eaeb"

NPM_PKGNAME = "cities-list"

inherit npmhelper
inherit native
