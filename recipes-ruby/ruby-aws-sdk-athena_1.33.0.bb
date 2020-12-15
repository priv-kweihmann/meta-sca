SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8e4f498728f7e41583ec70d9af295afd"
SRC_URI[sha256sum] = "2e3a597ebcd5ff07f435b3a4ff0a4e9f7d9ebbd3d8e968478997580560bc2893"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
