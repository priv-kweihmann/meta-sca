SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-function-name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.15.4.tgz"
SRC_URI[md5sum] = "193dbed0af18587526677c5813893643"
SRC_URI[sha256sum] = "35c81202e80904dd3da8af841fc662411fd1bd87fd908587fd269bc90134dd3b"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
