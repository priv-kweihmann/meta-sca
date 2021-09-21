SUMMARY = "NPM: rxjs"
DESCRIPTION = "Reactive Extensions for modern JavaScript"
HOMEPAGE = "https://github.com/ReactiveX/RxJS"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=80ca6de0630df9d3c3faee86819caa57"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/rxjs/-/rxjs-6.6.7.tgz"
SRC_URI[md5sum] = "bf59f9dd8fa9f3c7ccbebd9b6924b8c1"
SRC_URI[sha256sum] = "4098c33a24dfe1a854fd70837e8854b9d9c799c3f17b8c81e250b4a67f380526"

NPM_PKGNAME = "rxjs"

inherit npmhelper
inherit native
