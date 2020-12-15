SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "fbb645fc61c225e60654e0932d9ecfb6"
SRC_URI[sha256sum] = "9e577c52028ec2f43da583bd7c2bf9bad09077988f578522df61109f65fe1ddf"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
