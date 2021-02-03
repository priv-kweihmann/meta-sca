SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "877316dc178edbf5ce9abe2a42c70513"
SRC_URI[sha256sum] = "7c4f4b46cd28b37068f506bfa8d879282ff3e9351c49103e3f2f59592fb1e9fc"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
