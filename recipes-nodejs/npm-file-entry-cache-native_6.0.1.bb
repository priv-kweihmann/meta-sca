SUMMARY = "NPM: file-entry-cache"
DESCRIPTION = "Super simple cache for file metadata, useful for process that work o a given series of files and that only need to repeat the job on the changed ones since the previous run of the process"
HOMEPAGE = "https://github.com/royriojas/file-entry-cache#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45054d16a4a3e60f7b92d0d58fb6e05d"

DEPENDS = "npm-flat-cache-native"

SRC_URI = "https://registry.npmjs.org/file-entry-cache/-/file-entry-cache-6.0.1.tgz"
SRC_URI[md5sum] = "10aa48a01c8cbaf21ee53fe1a8cbd6a0"
SRC_URI[sha256sum] = "18cd8bebce421b87a7edbeb28036aea2938312c76ebfa79a55febb5476b6c185"

NPM_PKGNAME = "file-entry-cache"

inherit npmhelper
inherit native
