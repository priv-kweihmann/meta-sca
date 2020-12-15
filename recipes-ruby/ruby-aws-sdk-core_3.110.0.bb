SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-eventstream \
                  ruby-aws-partitions \
                  ruby-aws-sigv4 \
                  ruby-jmespath"

SRC_URI[md5sum] = "2bc5a7da71c3aec59fca906eb9bbd524"
SRC_URI[sha256sum] = "844eb2204fa8624fcf190968ed052b9e7b78aaaaeb70a31e6b77911a53e43dd3"

GEM_NAME = "aws-sdk-core"

inherit rubygems
