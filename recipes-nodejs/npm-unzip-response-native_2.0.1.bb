SUMMARY = "NPM: unzip-response"
DESCRIPTION = "Unzip a HTTP response if needed"
HOMEPAGE = "https://github.com/sindresorhus/unzip-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=5b422d6bf88afe88977d04f8bdd4959c"

SRC_URI = "https://registry.npmjs.org/unzip-response/-/unzip-response-2.0.1.tgz"
SRC_URI[md5sum] = "e51373c401f12074723c895404c947b9"
SRC_URI[sha256sum] = "a105a11429932b07c13e27d2863310c3e3f1b7609323eae78518b97ea7c16eb0"

NPM_PKGNAME = "unzip-response"

inherit npmhelper
inherit native
