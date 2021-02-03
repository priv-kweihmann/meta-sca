SUMMARY = "RubyGem: aws-sdk-cloudwatch"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch (CloudWatch)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "a2bc5c20767bf87396abc8f05edf1e8e"
SRC_URI[sha256sum] = "44af37557aad02537118044022a1ec01d9c13de8b170dff41f5317c46d004bef"

GEM_NAME = "aws-sdk-cloudwatch"

inherit rubygems
