SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8aa678700ccfc57cea3c48df9e903600"
SRC_URI[sha256sum] = "bd9b10df259fcebbe02b7a2559938ba3ee28cd7aad4afe8d9c1c3402065197da"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
