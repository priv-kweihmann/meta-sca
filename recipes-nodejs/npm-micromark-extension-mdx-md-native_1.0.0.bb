SUMMARY = "NPM: micromark-extension-mdx-md"
DESCRIPTION = "micromark extension to turn some markdown features off for MDX"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdx-md#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-mdx-md/-/micromark-extension-mdx-md-1.0.0.tgz"
SRC_URI[md5sum] = "a8709681eb2c499f32c0d68c9ce5634d"
SRC_URI[sha256sum] = "fa851eaddb7426f5779a9b6eaa07456015f9aaee377c83850ee90215853be69f"

NPM_PKGNAME = "micromark-extension-mdx-md"

inherit npmhelper
inherit native
