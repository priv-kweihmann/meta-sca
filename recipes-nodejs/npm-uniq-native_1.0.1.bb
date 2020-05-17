SUMMARY = "NPM: uniq"
DESCRIPTION = "Removes duplicates from a sorted array in place"
HOMEPAGE = "https://github.com/mikolalysenko/uniq"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34aed54d1454553d81a843e946b173a0"

SRC_URI = "https://registry.npmjs.org/uniq/-/uniq-1.0.1.tgz"
SRC_URI[md5sum] = "b7fd70b974406ccf0859667a6ff5cdcd"
SRC_URI[sha256sum] = "2e71598a50822caa9096d140f2269545e02e844311d861d62d6e9ecc57d4a9fc"

NPM_PKGNAME = "uniq"

inherit npmhelper
inherit native
