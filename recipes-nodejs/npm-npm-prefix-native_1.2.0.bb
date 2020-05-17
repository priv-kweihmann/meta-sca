SUMMARY = "NPM: npm-prefix"
DESCRIPTION = "Get global npm prefix. Respects npmrc configs"
HOMEPAGE = "https://github.com/eush77/npm-prefix"

DEPENDS = "npm-rc-native npm-shellsubstitute-native npm-untildify-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0622a954c2998399b4f61f597b1366ea"

SRC_URI = "https://registry.npmjs.org/npm-prefix/-/npm-prefix-1.2.0.tgz"
SRC_URI[md5sum] = "907910752f67f0bea210314b59076cec"
SRC_URI[sha256sum] = "bc58e0aa55cdb27533262c86d4ff2b37fd71af316d0f7f5adc54830ada8a11d1"

NPM_PKGNAME = "npm-prefix"

inherit npmhelper
inherit native
