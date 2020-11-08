SUMMARY = "NPM: file-entry-cache"
DESCRIPTION = "Super simple cache for file metadata, useful for process that work o a given series of files and that only need to repeat the job on the changed ones since the previous run of the process"
HOMEPAGE = "https://github.com/royriojas/file-entry-cache#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45054d16a4a3e60f7b92d0d58fb6e05d"

DEPENDS = "npm-flat-cache-native"

SRC_URI = "https://registry.npmjs.org/file-entry-cache/-/file-entry-cache-6.0.0.tgz"
SRC_URI[md5sum] = "a4de5d3696ecf88239e7cb11957eae36"
SRC_URI[sha256sum] = "4d432fbd54d65ba0b4d9b5b4ce27ef1534003bc0afd6c9524cbf074496630aac"

NPM_PKGNAME = "file-entry-cache"

inherit npmhelper
inherit native
