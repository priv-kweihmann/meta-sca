SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6dcbdd101d5603fefa99515b8414e3ad"
SRC_URI[sha256sum] = "6da242918f3003eb3b767d0240b67f044b4bbf1f25f54a707f79d90449358163"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
