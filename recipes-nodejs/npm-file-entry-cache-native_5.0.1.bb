SUMMARY = "NPM: file-entry-cache"
DESCRIPTION = "Super simple cache for file metadata, useful for process that work o a given series of files and that only need to repeat the job on the changed ones since the previous run of the process"
HOMEPAGE = "https://github.com/royriojas/file-entry-cache#readme"

DEPENDS = "npm-flat-cache-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45054d16a4a3e60f7b92d0d58fb6e05d"

SRC_URI = "https://registry.npmjs.org/file-entry-cache/-/file-entry-cache-5.0.1.tgz"
SRC_URI[md5sum] = "823c1d39c565f093da9f4bede262fff6"
SRC_URI[sha256sum] = "09a3d4079214a999db5cd3966cb049c40695c3d9906e1bd880535e52501c8b24"

NPM_PKGNAME = "file-entry-cache"

inherit npmhelper
inherit native
