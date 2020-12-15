SUMMARY = "RubyGem: aws-sdk-elasticloadbalancing"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "52c087ec0a45fcfda30183fd8f4f47f4"
SRC_URI[sha256sum] = "7d46d9bb802f5185ac9932b3f6d618c2f0e9dd88d590f8f45f58600503159c25"

GEM_NAME = "aws-sdk-elasticloadbalancing"

inherit rubygems
